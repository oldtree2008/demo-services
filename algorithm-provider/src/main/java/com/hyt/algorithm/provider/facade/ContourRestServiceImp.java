package com.hyt.algorithm.provider.facade;

import com.hyt.algorithm.ContourService;
import com.hyt.algorithm.facade.ContourRestService;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
/**
 * Created by cheng on 2017/3/14.
 */

public class ContourRestServiceImp implements ContourRestService {

    private ContourService contourService;
    public void setContourService(ContourService contourService) {
        this.contourService = contourService;
    }

    public String contour(String contourType) {
        if (RpcContext.getContext().getRequest(HttpServletRequest.class) != null) {
            try{
                String data = RpcContext.getContext().getRequest(HttpServletRequest.class).getParameter("data");
                String[] strlevels = RpcContext.getContext().getRequest(HttpServletRequest.class).getParameter("levels").split(",");
                double[] levels = new double[strlevels.length];
                int i = 0;
                for( String s :strlevels) {
                    levels[i++] = Float.parseFloat(s);
                }
                if(contourType.equalsIgnoreCase("contour")) {
                    return this.contourService.contour(data,levels);
                }else if(contourType.equalsIgnoreCase("contourFill")) {
                    return this.contourService.contourFill(data,levels);
                }
            }catch (Exception ex) {
                return "";
            }
        }
        return contourType;
    }
}

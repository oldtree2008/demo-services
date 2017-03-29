package com.hyt.algorithm.facade;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
/**
 * Created by cheng on 2017/3/14.
 */
@Path("contour_algorithm")
@Consumes({MediaType.TEXT_PLAIN})
@Produces({ContentType.TEXT_PLAIN_UTF_8})

public interface ContourRestService {
	@GET
    @Path("{contour}")
    String contour(@PathParam("contour") String contourType);
}

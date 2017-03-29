package com.hyt.algorithm.facade;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by cheng on 2017/3/27.
 */
@Path("hello")
@Consumes({MediaType.TEXT_PLAIN})
@Produces({ContentType.TEXT_PLAIN_UTF_8})
public interface DemoRestService {
    @GET
    @Path("{message}")
    String demo(@PathParam("message") String msg);
}

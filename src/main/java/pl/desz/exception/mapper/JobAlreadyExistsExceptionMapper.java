package pl.desz.exception.mapper;

import pl.desz.exception.JobAlreadyExistsException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class JobAlreadyExistsExceptionMapper implements ExceptionMapper<JobAlreadyExistsException> {

    @Override
    public Response toResponse(JobAlreadyExistsException exception) {
        return Response.status(Response.Status.CONFLICT)
                .build();
    }
}

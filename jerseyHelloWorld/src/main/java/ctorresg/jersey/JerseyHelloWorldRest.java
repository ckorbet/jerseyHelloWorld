package ctorresg.jersey;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * <p>
 * Class for JAX-RS Service Endpoint
 * </p>
 * @author Carlos Torres
 * @since Marzo 2014
 */
@Path("/jerseyHelloWorldRest")
public class JerseyHelloWorldRest {

	@GET
	@Path("/{parameter}")
	public Response responseMsg( @PathParam("parameter") final String parameter,
								 @DefaultValue("Nothing to say") @QueryParam("value") final String value) {
		final StringBuilder output = new StringBuilder("Hello from: ").append(parameter).append(" : ").append(value);
		return Response.status(200).entity(output.toString()).build();
	}

}

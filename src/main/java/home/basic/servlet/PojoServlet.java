package home.basic.servlet;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import home.basic.pojo.Pojo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Api(value = "/api/pojo", description = "gets some data from a servlet")
public class PojoServlet extends HttpServlet
{

    @ApiOperation(httpMethod = "GET", value = "Resource to get a pojo",
            response = Pojo.class, nickname = "getUser")
    @ApiResponses({@ApiResponse(code = 400, message = "Invalid input", response = ApiResponse.class)})
    @ApiImplicitParams(
            {
            @ApiImplicitParam(name = "name", value = "User's name", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "email", value = "User's email", required = true, dataType = "string", paramType = "query"),
            }
    )
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        super.doGet(req, resp);
    }
}

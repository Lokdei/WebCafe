package filters;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import model.User;
import util.UsersUtil;

/* @author BertGoens */
@WebFilter(
        urlPatterns = "/Admin/*"
)
public class AdminFilter implements Filter {

    private ServletContext context;

    @Override
    public void init(FilterConfig fc) throws ServletException {
        this.context = fc.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        User currentUser = UsersUtil.getLoggedInUser(context);
        if (currentUser != null && currentUser.getIsAdmin()) {
            chain.doFilter(request, response);
        } else {
            HttpServletResponse res = (HttpServletResponse) response;
            if (currentUser == null) {
                res.sendRedirect(context.getContextPath() + "/User/Login");
                return;
            } else {
                res.sendRedirect(context.getContextPath() + "/Home");
                return;
            }
        }
    }

    @Override
    public void destroy() {

    }

}

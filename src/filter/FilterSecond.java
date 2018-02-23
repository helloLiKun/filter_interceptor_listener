package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by likun on 2018/2/23 0023.
 */
public class FilterSecond implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("-----------filterSecond  init-------------");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-----------filterSecond  doFilter start-------------");
        filterChain.doFilter(req,resp);
        System.out.println("-----------filterSecond  doFilter end-------------");
    }

    @Override
    public void destroy() {
        System.out.println("-----------filterSecond  destroy-------------");
    }
}

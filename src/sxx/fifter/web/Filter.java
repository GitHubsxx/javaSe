package sxx.fifter.web;

public interface Filter {
	void doFilter(Request request, Response response, FilterChain chain);
}

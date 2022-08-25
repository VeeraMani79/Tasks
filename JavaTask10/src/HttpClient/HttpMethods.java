package HttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpMethods {
	public static void main(String[] args) throws IOException, InterruptedException {

		HttpClient hc = HttpClient.newHttpClient();

		HttpRequest creq = HttpRequest.newBuilder().uri(URI.create("http://www.google.com/")).build();

		HttpResponse<String> cres = hc.send(creq, HttpResponse.BodyHandlers.ofString());

		System.out.println("1.status code = " + cres.statusCode() + "\n");
		System.out.println("2.URL from the client =" + cres.uri() + "\n");
		System.out.println("3.SSL Session =" + cres.sslSession() + "\n");
		System.out.println("4.HTTP versions=" + cres.version() + "\n");
		System.out.println("5.Response Header=" + cres.headers() + "\n");
		System.out.println("6.Response Body=" + cres.body());

	}

}

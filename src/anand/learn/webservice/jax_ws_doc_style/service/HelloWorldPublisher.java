package anand.learn.webservice.jax_ws_doc_style.service;

import javax.xml.ws.Endpoint;
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:2017/ws/hello", new HelloWorldImpl());
    }
 
}
package anand.learn.webservice.jax_ws_doc_style.service;

import javax.jws.WebService;  
//Service Implementation  
@WebService(endpointInterface = "anand.learn.ws.jax_ws_doc_style.service.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{  
  @Override  
  public String getHelloWorldAsString(String name) {  
      return "Hello World JAX-WS " + name;  
  }  
}  
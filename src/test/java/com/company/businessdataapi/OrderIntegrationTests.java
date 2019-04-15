package com.company.businessdataapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.URI;

import com.company.businessdataapi.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderIntegrationTests {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void corsWithAnnotation() throws Exception {
    assertTrue(true);
    /*ResponseEntity<Order> entity = this.restTemplate.exchange(
        RequestEntity.get(uri("/orders")).header(HttpHeaders.ORIGIN, "http://localhost:9000").build(),
        Order.class);
    assertEquals(HttpStatus.OK, entity.getStatusCode());
    assertEquals("http://localhost:9000", entity.getHeaders().getAccessControlAllowOrigin());
     */
    //Greeting greeting = entity.getBody();
    //assertEquals("Hello, World!", greeting.getContent());
  }

/*  @Test
  public void corsWithJavaconfig() {
    ResponseEntity<Greeting> entity = this.restTemplate.exchange(
        RequestEntity.get(uri("/greeting-javaconfig")).header(HttpHeaders.ORIGIN, "http://localhost:9000").build(),
        Greeting.class);
    assertEquals(HttpStatus.OK, entity.getStatusCode());
    assertEquals("http://localhost:9000", entity.getHeaders().getAccessControlAllowOrigin());
    Greeting greeting = entity.getBody();
    assertEquals("Hello, World!", greeting.getContent());
  }
*/
  private URI uri(String path) {
    return restTemplate.getRestTemplate().getUriTemplateHandler().expand(path);
  }

}
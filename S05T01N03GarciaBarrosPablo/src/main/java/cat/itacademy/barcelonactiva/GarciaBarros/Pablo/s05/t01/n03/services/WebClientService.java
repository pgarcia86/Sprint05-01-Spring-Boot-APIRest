package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n03.services;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.model.domain.FlorEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {
	
	private WebClient webFlor;
	
	public WebClientService(WebClient.Builder webClientBuilder) {
		this.webFlor = webClientBuilder.baseUrl("http://localhost:9001/flor").build();
	}
	
	public Flux<FlorEntity> findFlor(){
		
		return this.webFlor.get().uri("/getAll")
				.retrieve()
				.bodyToFlux(FlorEntity.class);
	}
	
	public Mono<FlorEntity> findOne(int id){
		return this.webFlor.get().uri("/getOne/{id}", id)
				.retrieve()
				.bodyToMono(FlorEntity.class);
	}
	
	
	public Mono<FlorEntity> add(String name, String country){
		
		return this.webFlor.post().uri("/add/{name}/{country}", name, country)
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.body(Mono.just(new FlorEntity(name, country)), FlorEntity.class)
				.retrieve()
				.bodyToMono(FlorEntity.class);
	}
	
	
	public Mono<FlorEntity> update(Integer id, String name){
		
		return this.webFlor.put().uri("/update/{id}/{name}", id, name)
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.retrieve()
				.bodyToMono(FlorEntity.class);
		
	}
	
	/*
	 * 
	 * 
	 * TENGO QUE PONER UN MENSAJE PARA AVISAR QUE ELIMINO EL REGISTRO
	 * 
	 * 
	 * */
	
	public Mono<Void> delete(Integer id) {
		
		return this.webFlor.delete().uri("/delete/{id}", id)
				.retrieve()
				.bodyToMono(Void.class);
	}
	

}

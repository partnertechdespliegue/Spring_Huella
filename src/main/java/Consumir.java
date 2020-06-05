
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.catalina.filters.AddDefaultCharsetFilter.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.client.RestTemplate;

@Service
public class Consumir {

	@Autowired
	private RestTemplate restTemplate = new RestTemplate();

	// @Override
	public Integer conexionAppPagos(Asistencia conexion, String webservice) {
		Integer respuesta_conexion = 0;
		Asistencia rpta_conexion = new Asistencia();
		// "http://192.168.2.99:2000/pub/cargarefipagos/insertarEmpresasEfipagos";

		String url = "http://localhost:5000/api/" + webservice;// Constantes.raizConexionAppPagosPub+webservice;

		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(MediaType.APPLICATION_JSON);
		requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		// request entity is created with request body and headers
		HttpEntity<Asistencia> requestEntity = new HttpEntity<Asistencia>(conexion, requestHeaders);
		ResponseEntity<Asistencia> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, Asistencia.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			rpta_conexion = responseEntity.getBody();
			if (rpta_conexion.getIdAsistencia() == 1) {
				respuesta_conexion = 1;
			}
		} else {
			respuesta_conexion = 0;
		}
		return respuesta_conexion;
	}

}

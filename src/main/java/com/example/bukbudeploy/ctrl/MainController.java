package com.example.bukbudeploy.ctrl;

import com.example.bukbudeploy.global.ResponseMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@RestController
public class MainController {

    @ResponseBody
    @GetMapping()
    public ResponseEntity<ResponseMessage> getRootController() {
        // 헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application","json", StandardCharsets.UTF_8));

        // 리턴 메세지 설정
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setStatus(HttpStatus.OK);
        responseMessage.setMessage("정상입니다.");
        responseMessage.setData("Some Data");
        return new ResponseEntity<>(responseMessage, headers, HttpStatus.OK);
    }
}

package br.com.treinaweb.ediaristas.web.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlashMessage {
    
    private String classeCss;
    private String mensagem;
}

package br.com.brenoborges.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class ControllerComponent {

    // Componente gerenciado pelo Spring. Spring cuida de instanciar quando
    // necessário.
    @Autowired
    MeuComponent meuComponent;

    @GetMapping("/")
    public String chamandoComponent() {
        var resultado = meuComponent.chamarMeuComponente();
        return resultado;
    }
}

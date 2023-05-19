import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    @GetMapping("/venda")
    public String exibirVenda(Model model) {
        Cliente cliente = new Cliente("João", "Rua A, 123", "123456789");
        Produto produto = new Produto("Coca-Cola", 3.5);
        Venda venda = new Venda(cliente, produto, 3.5);

        model.addAttribute("venda", venda);

        return "venda";
    }
}

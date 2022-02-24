import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Banco {
    @Getter @Setter private String nome;
    @Getter @Setter private List<Cliente> contas;
}

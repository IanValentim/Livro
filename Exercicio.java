package exercicio;

public class Exercicio {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Ian", "Masculino", 15);
        Livro l1 = new Livro("O enigma da borboleta", "Kate Ellison", 312, p1);
        
        p1.Status();
        l1.detalhes();
        
        l1.avançarPag();
        l1.abrir();
        l1.folhear(245);
        l1.avançarPag();
        l1.avançarPag();
        l1.avançarPag();
        l1.detalhes();
        l1.fechar();

    }

}

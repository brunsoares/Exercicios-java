/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.programmain;

/**
 *
 * @author bruno
 */
public class Livro implements ControllerLivro{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtu;
    private boolean aberto;
    private Pessoa leitor;
    
    //Construtor da classe
    public Livro(String t, String a, int totP, int pAtu, Pessoa lt){
        this.titulo = t;
        this.autor = a;
        this.totPag = totP;
        this.pagAtu = pAtu;
        this.leitor = lt;
    }
    
    //Getters e setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setPagAtu(int pagAtu) {
        this.pagAtu = pagAtu;
    }

    public int getPagAtu() {
        return pagAtu;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    
    //Metodo da classe que mostra os detalhes do livro, incluindo o leitor
    public void detalhesLivro(){
        System.out.println("-*- DETALHES DO LIVRO -*-");
        System.out.println("Titulo:    "+this.getTitulo());
        System.out.println("Autor:     "+this.getAutor());
        System.out.println("Total de páginas:   "+this.getTotPag());
        System.out.println("Página atual:   "+this.getPagAtu());
        System.out.println("Livro está aberto?      "+this.getAberto());
        System.out.println("-*- DETALES DO LEITOR -*-");
        System.out.println("Quem está lendo?    "+this.getLeitor().getNome());
        System.out.println("Idade do Leitor:    "+this.getLeitor().getIdade());
        System.out.println("Sexo do Leitor:     "+this.getLeitor().getSexo());
        System.out.println("-------------------------------------------------");
    }
    
    //Metodos Abstratos do ControlllerLivro
    @Override
    public void abrirLivro() {
        if(this.getAberto() == false){
             this.setAberto(true);
        }else{
            System.out.println("Livro está aberto, Feche para fazer essa ação");
        }
    }

    @Override
    public void fecharLivro() {
        if(this.getAberto() == true){
            this.setAberto(false);
        }else{
            System.out.println("Livro está fechado, Abra para fazer essa ação");
        }
    }

    @Override
    public void folhearLivro() {
        if(this.getAberto() == true){
            int falta = this.getTotPag() - this.getPagAtu();
            System.out.println("Falta "+falta+" para terminar esse livro");
        }else{
            System.out.println("Livro está fechado, Abra para fazer essa ação");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getAberto() == true){
            this.setPagAtu(this.getPagAtu()+1);
        }else{
            System.out.println("Livro está fechado, Abra para fazer essa ação");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto()== true){
            this.setPagAtu(this.getPagAtu()-1);
        }else{
            System.out.println("Livro está fechado, Abra para fazer essa ação");
        }
    }
    
}

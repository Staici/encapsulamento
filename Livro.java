public class Livro{
  private int isbn;
  private String nome;
  private String Editora;
  Livro(int isbn, String nome,String Editora){
    this.isbn=isbn;
    this.nome=nome;
    this.Editora=Editora;
  }
  public int getisbn(){
    return isbn;
  }
  public void setisbn(int isbn){
    this.isbn=isbn;
  }
  public String getnome(){
    return nome;
  }
  public void setnome(String nome){
    this.nome=nome;
     }
  public String getEditora(){
    return Editora;
  }
  public void setEditora(String Editora){
    this.Editora=Editora;
  }
}
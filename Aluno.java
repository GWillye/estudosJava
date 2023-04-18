// 2.3
/*Você deve criar uma classe Aluno, de modo a armazenar diferentes informações sobre um aluno.

Essa classe deve possuir os seguintes atributos:

disciplinas: Array de String contendo a lista de disciplinas que o aluno cursa
nome:  String armazenando o nome do aluno
RGA: String que armazena o RGA do aluno
medias: array de ponto-flutuante precisão double contendo as notas dos alunos em cada uma das disciplinas (em ordem)
anoDeIngresso: inteiro que armazena o ano em que o aluno ingressou
Também deve possuir os seguintes métodos:

int tempoDeCurso(int ano): recebe o ano vigente e calcula o tempo de curso que o aluno possui, subtraindo do ano de ingresso
double devolveCoeficienteRendimento(): calcula o coeficiente de rendimento do aluno como a média artimética de todas as médias armazenadas no objeto
void imprimeNome(): imprime na tela o nome do aluno
Boolean comparaAluno(Aluno B): Recebe um segundo aluno (B) e devolve true caso ele tenha o mesmo RGA que o objeto desse método, ou false caso contrário
Por fim, deve apresentar os seguintes construtores:

Aluno(String novoNome, String rga, int AnoIngresso): constrói o aluno com nome, RGA e ano de ingresso, e não inicializa a lista de notas e disciplinas.
Aluno(String novoNome, String rga, int AnoIngresso, String[] listaDisciplinas, double[] listaMedias): inicializa o aluno com todos os valores possíveis dos atributos */

public class Aluno
{
    public String nome;
    public String RGA;
    public String[] disciplinas;
    public double[] medias;
    public int anoDeIngresso;
    
    public int tempoDeCurso(int ano) 
    {
        return (ano - anoDeIngresso);
    }
    
    public double devolveCoeficienteRendimento() 
    {
        double soma = 0;
        for (int cont = 0; cont < medias.length; cont++)
        {
            soma += medias[cont]; 
        }
        return (soma / medias.length);
    }
    
    public void imprimeNome() 
    {
        System.out.println(nome);
    }
    
    public boolean comparaAluno(Aluno B) 
    {
        if (this.RGA == B.RGA)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    
    public Aluno(String novoNome, String rga, int AnoIngresso) 
    {
        nome = novoNome;
        RGA = rga;
        anoDeIngresso = AnoIngresso;
    }

    public Aluno(String novoNome, String rga, int AnoIngresso, String[] listaDisciplinas, double[] listaMedias) 
    {
        this.disciplinas = listaDisciplinas;
        this.medias = listaMedias;
        this.nome = novoNome;
        this.RGA = rga;
        anoDeIngresso = AnoIngresso;
        for(int cont = 0; cont < listaDisciplinas.length; cont++)
        {
            disciplinas[cont] = listaDisciplinas[cont];
        }
        for(int cont = 0; cont < listaMedias.length; cont++)
        {
            medias[cont] = listaMedias[cont];
        }
        
    }
}
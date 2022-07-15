import java.util.ArrayList;

public class CorpoProjetoAtividade
{
    String identificacao;
    String descricao;
    //DATA E HORA DE TERMINO
    int diafinal;
    int mesfinal;
    int anofinal;
    int horafinal;
    int minutofinal;
    //DATA E HORA DE INICIO
    int diainicio;
    int mesinicio;
    int anoinicio;
    int horainicio;
    int minutoinicio;
    Usuario coordenador; //COORDENADOR/RESPONSÁVEL
    ArrayList<Usuario> profissionaisNoProjeto;
    ArrayList<Atividade> atividadesDentroProjeto;

    public int getAnofinal()
    {
        return anofinal;
    }
    
    public int getAnoinicio(){
        return anoinicio;
    }

    public ArrayList<Atividade> getAtividadesDentroProjeto() {
        return atividadesDentroProjeto;
    }

    public Usuario getCoordenador() {
        return coordenador;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDiafinal() {
        return diafinal;
    }

    public int getDiainicio() {
        return diainicio;
    }

    public int getHorafinal() {
        return horafinal;
    }

    public int getHorainicio() {
        return horainicio;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public int getMesfinal() {
        return mesfinal;
    }

    public int getMesinicio() {
        return mesinicio;
    }

    public int getMinutofinal() {
        return minutofinal;
    }

    public int getMinutoinicio() {
        return minutoinicio;
    }

    public ArrayList<Usuario> getProfissionaisNoProjeto() {
        return profissionaisNoProjeto;
    }

    public void setAnofinal(int anofinal) {
        this.anofinal = anofinal;
    }

    public void setAnoinicio(int anoinicio) {
        this.anoinicio = anoinicio;
    }

    public void setAtividadesDentroProjeto(ArrayList<Atividade> atividadesDentroProjeto) {
        this.atividadesDentroProjeto = atividadesDentroProjeto;
    }

    public void setCoordenador(Usuario coordenador) {
        this.coordenador = coordenador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDiafinal(int diafinal) {
        this.diafinal = diafinal;
    }

    public void setDiainicio(int diainicio) {
        this.diainicio = diainicio;
    }

    public void setHorafinal(int horafinal) {
        this.horafinal = horafinal;
    }

    public void setHorainicio(int horainicio) {
        this.horainicio = horainicio;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public void setMesfinal(int mesfinal) {
        this.mesfinal = mesfinal;
    }

    public void setMesinicio(int mesinicio) {
        this.mesinicio = mesinicio;
    }

    public void setMinutofinal(int minutofinal) {
        this.minutofinal = minutofinal;
    }

    public void setMinutoinicio(int minutoinicio) {
        this.minutoinicio = minutoinicio;
    }

    public void setProfissionaisNoProjeto(ArrayList<Usuario> profissionaisNoProjeto) {
        this.profissionaisNoProjeto = profissionaisNoProjeto;
    }
}

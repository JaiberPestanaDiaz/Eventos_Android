package com.example.loginregistro.models;
public class Eventico {
    private AmbienteEvento ambiente;
    private CompetenciaEvento competencia;
    private String dia;
    private int[] diasTrabajados;
    private FichaEvento ficha;
    private String horario;
    private int horas;
    private String municipio;
    private String nivel;
    private ProgramaEvento programa;
    private ResultadoEvento resultado;

    public AmbienteEvento getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(AmbienteEvento ambiente) {
        this.ambiente = ambiente;
    }

    public CompetenciaEvento getCompetencia() {
        return competencia;
    }

    public void setCompetencia(CompetenciaEvento competencia) {
        this.competencia = competencia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int[] getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int[] diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public FichaEvento getFicha() {
        return ficha;
    }

    public void setFicha(FichaEvento ficha) {
        this.ficha = ficha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public ProgramaEvento getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramaEvento programa) {
        this.programa = programa;
    }

    public ResultadoEvento getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEvento resultado) {
        this.resultado = resultado;
    }
}

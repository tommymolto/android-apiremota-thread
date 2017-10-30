
package br.edu.infnet.remoteapi;

import java.util.List;

public class GradeProgramacao {

    private List<Slot> slots = null;
    private String link;
    private Boolean diaAnterior;
    private Boolean proximoDia;
    private String diaMes;
    private String diaDaSemana;
    private Integer id;
    private String dataProgramacao;

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getDiaAnterior() {
        return diaAnterior;
    }

    public void setDiaAnterior(Boolean diaAnterior) {
        this.diaAnterior = diaAnterior;
    }

    public Boolean getProximoDia() {
        return proximoDia;
    }

    public void setProximoDia(Boolean proximoDia) {
        this.proximoDia = proximoDia;
    }

    public String getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(String diaMes) {
        this.diaMes = diaMes;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataProgramacao() {
        return dataProgramacao;
    }

    public void setDataProgramacao(String dataProgramacao) {
        this.dataProgramacao = dataProgramacao;
    }

}

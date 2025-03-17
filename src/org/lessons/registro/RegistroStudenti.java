package org.lessons.registro;

import org.lessons.student.Studente;

public class RegistroStudenti {
    
    private Studente[] registro;

    public Studente[] getRegistro() {
        return this.registro;
    }

    public void setRegistro(Studente[] registro) {
        this.registro = registro;
    }

    public RegistroStudenti() {
        this.registro = new Studente[0];
    }

    public void addStudente(Studente studente) {
        Studente[] RegistroAggiornato = new Studente[this.registro.length + 1];
        for (int i = 0; i < this.registro.length; i++) {
            RegistroAggiornato[i] = this.registro[i];
        }
        RegistroAggiornato[this.registro.length] = studente;
        this.registro = RegistroAggiornato;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.registro.length; i++) {
            result += this.registro[i].toString() + "\n";
        }
        return result;
    }

}
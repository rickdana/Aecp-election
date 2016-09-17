package fr.aecp.election.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 * Created by dana on 17/09/16.
 *
 * This Class stand for an election session. It contains certain properties:
 *
 * id: the session id
 * dateElection: the session date
 * electeurs: list of all electorate
 * postes: a list of positions
 * commentaire: any comment about the election
 * procesVerbal: link to the "proces verbal" of the session
 */
public class Election {
    int id;
    Date dateElection;
    HashSet<Electeur> electeurs;
    HashSet<Poste> postes;
    String commentaire;
    String porcesVerbal;

    public Election() {
    }

    public Election(int id, Date dateElection, HashSet<Electeur> electeurs, HashSet<Poste> postes, String commentaire, String porcesVerbal) {
        this.id = id;
        this.dateElection = dateElection;
        this.electeurs = electeurs;
        this.postes = postes;
        this.commentaire = commentaire;
        this.porcesVerbal = porcesVerbal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPorcesVerbal() {
        return porcesVerbal;
    }

    public void setPorcesVerbal(String porcesVerbal) {
        this.porcesVerbal = porcesVerbal;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public HashSet<Poste> getPostes() {
        return postes;
    }

    public void setPostes(HashSet<Poste> postes) {
        this.postes = postes;
    }

    public HashSet<Electeur> getElecteurs() {
        return electeurs;
    }

    public void setElecteurs(HashSet<Electeur> electeurs) {
        this.electeurs = electeurs;
    }

    public Date getDateElection() {
        return dateElection;
    }

    public void setDateElection(Date dateElection) {
        this.dateElection = dateElection;
    }

    @Override
    public String toString() {
        return "Election{" +
                "id=" + id +
                ", dateElection=" + dateElection +
                ", electeurs=" + electeurs +
                ", postes=" + postes +
                ", commentaire='" + commentaire + '\'' +
                ", porcesVerbal='" + porcesVerbal + '\'' +
                '}';
    }
}

package ch.hesge.algo;

import ch.hesge.algo.model.Company;

import java.util.Set;

public class E {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * retourner une Company fusionnée dont le nom est la concaténation du nom de toutes les Company séparés par " & "
     * et dont les Employee consistent en l'union des Employee de toutes les Company.
     * Chaque employé doit garder le même firstName, lastName, birthdate et department ! Seul la company change !
     *
     * Par exemple :
     *
     * Soit la Company "Foo" qui a pour Employee Alice et Bob
     * Soit la Company "Bar" qui a pour Employee Charles
     *
     * La Company retournée doit avoir :
     *
     * Pour nom "Foo & Bar"
     * Pour Employee Alice, Bob et Charles
     *
     * @param companies Company
     * @return Company fusionnée
     */
    public Company merge(Set<Company> companies) {
        Company company = null;
        return company;
    }
}

package ch.hesge.algo;

import ch.hesge.algo.model.Company;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class L {

    /**
     * En utilisant uniquement l'API Streams,
     * retourner une String dont le nom est la concaténation de toutes les String séparées par " & ".
     * <p>
     * Par exemple :
     * <p>
     * Soit la String "Foo"
     * Soit la String "Bar"
     * <p>
     * La String retournée doit être "Foo & Bar"
     *
     * @param strings List de Strings
     * @return String concaténée
     */
    public String merge(List<String> strings) {
        return strings.stream().map(Object::toString).collect(Collectors.joining(" & "));
    }
}

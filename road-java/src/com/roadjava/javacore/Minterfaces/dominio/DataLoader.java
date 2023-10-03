package com.roadjava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();
    // Ou poderia ser
    // public abstract void carregar();

    // Métodos com implementações

    public default void checkPermissions() {
        System.out.println("Checando permissões");
    }
}

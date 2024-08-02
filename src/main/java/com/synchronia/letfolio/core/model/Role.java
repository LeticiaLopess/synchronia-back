package com.synchronia.letfolio.core.model;

public enum Role {
    ADMIN("Administrator"),
    USER("User"),
    GUEST("Guest");

    private final String description; // (final -> imutável após inicialização)

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

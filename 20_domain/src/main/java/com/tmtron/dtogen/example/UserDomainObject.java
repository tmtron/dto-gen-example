package com.tmtron.dtogen.example;

import org.immutables.value.Value;

@Value.Immutable
public abstract class UserDomainObject {

    @Value.Auxiliary
    protected abstract String firstName();

    abstract String lastName();


}

package com.notixia.whh.mytestapplication.mvp_injection;

import javax.inject.Inject;

public class SayHelloPresenterImpl implements SayHelloContract.Presenter {

    private Person person;
    private SayHelloContract.View view;

    @Inject
    public SayHelloPresenterImpl(Person person, SayHelloContract.View view) {
        this.person = person;
        this.view = view;
    }

    @Override
    public void loadMessage() {
        if (person.getFirstName() == null && person.getLastName() == null) {
            view.showError("No person name found.");
            return;
        }

        String message = "Hi " + person.getName() + "!";
        view.showMessage(message);
    }

    @Override
    public void saveName(String firstName, String lastName) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
    }
}

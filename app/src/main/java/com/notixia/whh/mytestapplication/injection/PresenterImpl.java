package com.notixia.whh.mytestapplication.injection;

public class PresenterImpl implements MVPContract.ContactPresenter{

    MVPContract.ContractView view;

    public PresenterImpl( MVPContract.ContractView view ){
        this.view = view;
    }

    @Override
    public void greetMessage( String message ) {
        view.showMessage( message );
    }
}

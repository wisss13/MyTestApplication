package com.notixia.whh.mytestapplication.injection;

public interface MVPContract {


    interface ContractView{
        void showMessage( String message );
    }

    interface ContactPresenter{
        void greetMessage( String message );
    }


}

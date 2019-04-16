package gabriellee.project.frompublisher_rxjava;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import okhttp3.ResponseBody;

public class MainViewModel extends ViewModel {

    private Repository repository;

    public MainViewModel() {
        repository = Repository.getInstance();
    }

    public LiveData<ResponseBody> makeQuery(){
        return repository.makeReactiveQuery();
    }

}
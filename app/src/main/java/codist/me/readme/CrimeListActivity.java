package codist.me.readme;

public class CrimeListActivity extends SingleFragmentAcitivty {
    @Override
    protected android.support.v4.app.Fragment createFragment() {
        return new CrimeListFragment();
    }
}

package codist.me.readme;

import android.app.Fragment;

public class CrimeListActivity extends SingleFragmentAcitivty {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

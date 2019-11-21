package com.example.zwq.beatbox;

import androidx.fragment.app.Fragment;
;

public class BeatBoxActivity extends SingleFragmentActivity {
    protected Fragment createFragment(){
        return BeatBoxFragment.newInstance();
    }

}

package hu.unideb.inf.celebration;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;

public class DownloadAsyncTask extends AsyncTask<Void, Integer, String> {
    private WeakReference<Button> weakButton;
    private WeakReference<ProgressBar> weakProgressBar;
    private WeakReference<TextView> weakTextView;
    private WeakReference<String> weakPath;

    public DownloadAsyncTask(Button b, ProgressBar pb, TextView tv, String path) {

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... voids) {
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

    }
}

import org.bukkit.Bukkit;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;

public class Updater {
    public void check() {
        String currentversion = this.getDescription().getVersion();
        getLogger().info("Checking update...");
        try {
            URL url = new URL("https://raw.githubusercontent.com/username/repo-name/master/latest.txt");
            InputStream is = url.openStream();
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(ir);
            String version = br.readLine();
            if (version.equals(currentversion)) {
                getLogger().info("You are using the latest version of the plugin!");
            } else {
                getLogger().info("Outdated plugin!");
                getLogger().info("Please go to plugin page and download the latest version!");
            }
        } catch (Throwable t) {
            try {
                URL url = new URL("https://cdn.jsdelivr.net/gh/username/repo-name/latest.txt");
                InputStream is = url.openStream();
                InputStreamReader ir = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(ir);
                String version = br.readLine();
                if (version.equals(currentversion)) {
                    getLogger().info("You are using the latest version of the plugin!");
                } else {
                    getLogger().info("Outdated plugin!");
                    getLogger().info("Please go to plugin page and download the latest version!");
                }
            } catch (Throwable e) {
                getLogger().info("Error checking plugin update!");
            }
        }
    }
}
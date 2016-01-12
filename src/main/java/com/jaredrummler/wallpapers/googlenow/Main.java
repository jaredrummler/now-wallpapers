/*
 * Copyright (C) 2016. Jared Rummler <me@jaredrummler.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.jaredrummler.wallpapers.googlenow;

import com.github.kevinsawicki.http.HttpRequest;

import java.io.File;

public class Main {

  public static void main(String[] args) {
    // Download Google Now wallpapers for 888, 1080, and 2560px
    File directory = new File("google-now-wallpapers");
    for (NowWallpaper wallpaper : NowWallpaper.values()) {
      int[] dimens = {888, 1080, 2560};
      int[] times = {NowWallpaper.DAWN, NowWallpaper.DAY, NowWallpaper.DUSK, NowWallpaper.NIGHT};
      String[] names = {"dawn", "day", "dusk", "night"};
      for (int dimen : dimens) {
        File dir = new File(directory, String.format("%dpx", dimen));
        dir.mkdirs();
        for (int i = 0; i < times.length; i++) {
          String url = wallpaper.getUrl(times[i], dimen, dimen);
          File file = new File(dir, wallpaper.name().toLowerCase() + "_" + names[i] + ".jpg");
          HttpRequest request = HttpRequest.get(url);
          request.receive(file);
        }
      }
    }
  }

}

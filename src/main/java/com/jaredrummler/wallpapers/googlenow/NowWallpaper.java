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

import java.util.Calendar;
import java.util.Locale;

/**
 * 11 Google Now wallpapers with dawn, day, dusk and night versions.
 *
 * <pre>
 *   // Get the chicago google now wallpaper
 *   String url = NowWallpaper.CHICAGO.getUrl(NowWallpaper.DAY);
 * </pre>
 */
public enum NowWallpaper {
  AUSTIN(
      "zAQwPdGWDc8a11nnSPM9peFsPHHzXxa0v1BGttsWfFy4g-kUXipz0zvcrXuGsKE", // dawn
      "GB25hdlTR-h07vrrB5XRNyQMfPxpTmP9DRu7DW2iTjj4_B0ywcbulk4MX5tmeQ", // day
      "U7M2euecz7uMJg1KA_jhcJcCXg4ZQ7ZZmQIr2aUingqFm060K1FxZu2md6zfvF-T", // dusk
      "weQrxcZZp-Ut00kjauDe_cE4lbwtjwU__Xv-XtrXMBbw2lLwpb6dsevmW86MWw" // night
  ),
  BERLIN(
      "8ubzNsDLQGQ8fYot0UcT0pWeqXPe_Z3jCpm398FuzE8ulYy5ysUXkVnUkwbFof8t", // dawn
      "q7AvSpLNCAOjlQAzPyh73cJhUewNo6-fznEvQxP07U7Z7IzuV53oZG5Lyh4Mkw", // day
      "-30idiQtgOyr5KF7mYdV8cc85SNqLFcgBzT_UQCBKCQcGg7LhTfiATkNiToVYg", // dusk
      "2JEs07oznuuvgcgzgjAxRSskgqj3LI9gpATJuoYU58R4h5Yg4EmEfWy3QVQdXwQ" // night
  ),
  CHICAGO(
      "HkTiPVXRlpbfe8FDJz6jlLW7kVNL6lJo-PaedbBq6HcagzCjLNt6lQ3OgDWRBI8", // dawn
      "XKhGtSHgY06OVIHNVxMfvvcKhWGOI7qhLbSmOJ9p58GA-v7xCFvhHCyWIXm_dg", // day
      "Fc15BNNdT8-aBORa8THhrf4dF6a-mslmwd3pXu0-sqvQrynDeD0i17K0eAX4a2E", // dusk
      "RlSDbCW2Fs5fHEzUXbVkAhjtzyaULSxG1zsUz0OmTgajiIL_cBMk4jLYnPxnB0cP" // night
  ),
  GREAT_PLAINS(
      "-eRaUK3T0bbuJdhKDMJ-wgwNmkvOgp1t7qvw-0-4Y27jFauvwyFyAPNxQCqrlgc", // dawn
      "OBlnWOdeWdlVR0fgVsbSWYuXVHudBGd382Yv6ckNNBPQbFIdWWJFMdch5H3a7Kw", // day
      "a7BiG1mNWojYk95fHBJCJKuJIarvQqvr6TaDTdTNY0DjQckdKq4MX3mJQkGI3LI", // dusk
      "BkE3y4c_8D3gTl2k6dLfmnKWha5e45XnKZP8NJ4pG4pXUb_J19_QBrxrthRk1A" // night
  ),
  HONOLULU(
      "IjAj-JLbrX9CtwOXvR5R94zWVd_-De7yb-KSSCauKFjL7fc7u05lh4KxlABhT1g", // dawn
      "dhrhITD19-MNErPWdzr9s7gD3Dw6XdbqemQ9lFsXDDHwRgTBrRN2aAygtbjcWpY", // day
      "E8ubHH8XziIK5t3ou9uj1xpq8XKNGKL-OIha6rnlhq1qCXPOvrI1eXqAn7z5A-A", // dusk
      "83jTpNKw0R4OW3hecAeo_9D56xY1c9o3a-opn8e8j0UG8lHy6vE8x2Ocum1GctE" // night
  ),
  LONDON(
      "_yM2g1jXS3GxmovyMTAo5-8q7mNY8CYZlh8rQK0xNeIfJMytLlf2FoIXM_F3wg", // dawn
      "SdhQ1CORhZsvITVgd6MPRJ2Nx3U4JupHEs9qEPjImVkZf-sLB6hhDWIsGpALlvo", // day
      "6OWsC7rvXQX8D4pzAlfOk9qaRvszP4vDuTERy42h2dMADmEHI26AYYDrUcgMyQ", // dusk
      "b95yYOipfo5QmknDxUhqyJz52pfncOYwhXhMpt7Yu3W3ycwZidLpWtC388SmRxB5" // night
  ),
  MOUNTAINS(
      "LeDpxkfCDssG2jwo20Tg01UxnUc4-PZUojwKsPzIQoGJ_CgbXc7KVko8o3nk5zA", // dawn
      "bosDZkBJxNdwo-dXGZeBkYtfCVnTFq96zqC08UV4dmIccI4YBr5p0CyCE7vmj2w", // day
      "DCGfFj7ILzkFXXDgCliyTAq-cjKs8eyoTstREjhB2grAzzjYnlelGfpIQ4cEX4c", // dusk
      "QgqUFGYoAxRkyvbl_5Hq2L6CTsaGXt9kaqrMdSxga-462Uyv2IViGw7OBzDMWNI" // night
  ),
  NEW_YORK(
      "40TWudSUSlS-D-RNu0ZQRlOrifj7K3C-hKKwstSjYsNjvWGkVQ_-QPRU5b76XAI", // dawn
      "OONnhdgrhh1x14gmAeHL6joB09j0Yn7ycEgSx2Dk75cEfZFVDeQp_hFHMkZxeWw", // day
      "qhVIITlUyAKh0l1fy1sIA32b0vnj-g5n07vhnhFqD2YovgXST5N4up4Mtb0Aa4Y", // dusk
      "dq1rtn76Xertxh17J02UknLxRUgLX04f6dXjeTctgEnHudDHro_ViIJ1F68fyu3z" // night
  ),
  SAN_FRANCISCO(
      "IBBjIVcMzPNui1BwBg2xK9VrA03RZ6l4PPr9nlMWJSe8lS1bI1q_0ObcIZ7aIsER", // dawn
      "eSJx22wFR4rSVcVI_yOVDmrrF696eptumrxJLlmWpL3T-riRuXoRvgBhesx8mg", // day
      "G4Pl--INh2dHgjjYF6Kr_0Cc85SK9eP6UespNcBwimb1G0HmG9Y99T0OVL6lHTSd", // dusk
      "6rLbkZWhGVPxAVCosBf3AMhEtiie5jUl9qAfOS0HV6bExLpNOmnwezZnAlHwDA" // night
  ),
  SEATTLE(
      "x7wYMKpb2CGWK7Gqck0kSAX9uOHVvduWBresMNwtlokpVzOwQ9lOfEXsZgM75Gti", // dawn
      "4kPg4fdvMJgnIgfFfCso_Ui8BHaVibW4VQb6vYq2WuUXJ7g_xU-qmUYJoZ1Y6w", // day
      "_QetNT7lfWzeWXZArk0y-kq3ZQCps9l4PZK9G2UxHXLMiK_nDEKDGhmQvqbYBs0", // dusk
      "3ctptPGg5pMe2gjbqNpDX8ZzgrSz1HWa0YfyshLsom8XAvFQJJtsJZIuB_uqyQ" // night
  ),
  TAHOE(
      "iM89ChxsvNmC7ajPUgbkZgHuuD6JB9xtUbmh5ov1hDZqSDDZNCpByENjjiv9WYq2", // dawn
      "dhmfa5_k78ytD0v71S7EMyFN13MOQMzaLFwUVNCNsNXkjcRfgshLhyuBo3IRpQ", // day
      "dswhgQX4GaEif9sy__jfVdf1vevCkdDHPmxV7Nu3JGu15aApntn3lYIkq_oY", // dusk
      "2oiPv-lr_VLFIHKa1KEKbzlVs1LGZukNfu0BWVzXPUZuG6bMfwTWtaVsvKFJkZUu" // night
  );

  /** 5:00 am - 6:59 am */
  public static final int DAWN = 0;

  /** 7:00 am - 5:59 pm */
  public static final int DAY = 1;

  /** 6:00 pm - 7:59 pm */
  public static final int DUSK = 2;

  /** 8:00 pm - 4:59 am */
  public static final int NIGHT = 3;

  /**
   * @return {@link #DAWN}, {@link #DAY}, {@link #DUSK}, or {@link #NIGHT} depending on the time
   * of day.
   */
  public static int getTimeOfDay() {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    if (hour <= 4 || hour >= 20) {
      return NIGHT;
    } else if (hour >= 5 && hour <= 6) {
      return DAWN;
    } else if (hour >= 7 && hour <= 17) {
      return DAY;
    } else if (hour >= 18 && hour <= 19) {
      return DUSK;
    }
    return DAY;
  }

  final String[] ids;

  NowWallpaper(String... ids) {
    this.ids = ids;
  }

  /**
   * Get the wallpaper URL (1000px max width) based on the time of day (dawn, day, dusk, or night).
   *
   * @return the URL
   */
  public String getUrl() {
    return getUrl(1000, 1000);
  }

  /**
   * Get the wallpaper URL (1000px max width)
   *
   * @param index
   *     {@link #DAWN}, {@link #DAY}, {@link #DUSK}, or {@link #NIGHT}
   * @return the URL
   */
  public String getUrl(int index) {
    return getUrl(index, 1000, 1000);
  }

  /**
   * Get the wallpaper URL based on the time of day (dawn, day, dusk, or night).
   *
   * @param width
   *     width of the wallpaper (max width available: 2560)
   * @param height
   *     height of the wallpaper (max height available: 1098)
   * @return the URL
   */
  public String getUrl(int width, int height) {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    if (hour <= 4 || hour >= 20) {
      return getUrl(NIGHT, width, height);
    } else if (hour >= 5 && hour <= 6) {
      return getUrl(DAWN, width, height);
    } else if (hour >= 7 && hour <= 17) {
      return getUrl(DAY, width, height);
    } else if (hour >= 18 && hour <= 19) {
      return getUrl(DUSK, width, height);
    }
    return getUrl(DAY, width, height); // shouldn't get here.
  }

  /**
   * Get the URL to the wallpaper hosted by Google.
   *
   * @param index
   *     {@link #DAWN}, {@link #DAY}, {@link #DUSK}, or {@link #NIGHT}
   * @param width
   *     width of the wallpaper (max width available: 2560)
   * @param height
   *     height of the wallpaper (max height available: 1098)
   * @return the URL
   */
  public String getUrl(int index, int width, int height) {
    return String.format(Locale.US, "http://lh4.ggpht.com/%s=w%d-h%d", ids[index], width, height);
  }

}

package com.MovieRater;

public class API {
}

    /* JsonReader rdr = Json.createReader(con.getInputStream());
 JsonObject obj = rdr.readObject();
    String title = obj.getString("original_title");

   url = new URL("http://api.themoviedb.org/3/movie/550?api_key={MY_API_KEY}");
       HttpURLConnection con = (HttpURLConnection) url.openConnection();

       con.setDoOutput(true);
      con.setRequestMethod("GET");
          con.setRequestProperty("Content-Type", "application/json");

        BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

          String output;
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
             System.out.println(output);
          }

<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 3
        </title>
    </head>
    <body>
        <p>
            ===============================<br>
            Praktikum 3<br>
            ===============================<br>
            <br>
            
            <form action = "praktikum3.php" method = "POST">
                <fieldset>
                    ===============================<br>
                    Penjumlahan Waktu<br>
                    ===============================<br>
                    <legend>
                        Nomor 1
                    </legend>
                    <p>
                        Masukkan jam            :
                        <input type = "number" name="jam_1" placeholder="Jam"/>
                    </p>
                    <p>
                        Masukkan menit          :
                        <input type = "number" name="menit_1" placeholder="Menit"/>
                    </p>
                    <p>
                        Masukkan menit kemudian :
                        <input type = "number" name="menitKemudian" placeholder="Menit kemudian"/>
                    </p>
                    <p>
                        <input type="submit" name="submit_1" value="Submit" target="_blank">
                    </p>
                </fieldset>
            </form>
        </p>
        <p>
            <form action = "praktikum3.php" method = "POST">
                <fieldset>
                    ===============================<br>
                    Pengurangan Waktu<br>
                    ===============================<br>
                    <legend>
                        Nomor 2
                    </legend>
                    <p>
                        Masukkan jam            :
                        <input type = "number" name="jam_2" placeholder="Jam"/>
                    </p>
                    <p>
                        Masukkan menit          :
                        <input type = "number" name="menit_2" placeholder="Menit"/>
                    </p>
                    <p>
                        Masukkan menit lalu :
                        <input type = "number" name="menitLalu" placeholder="Menit lalu"/>
                    </p>
                    <p>
                        <input type="submit" name="submit_2" value="Submit">
                    </p>
                </fieldset>
            </form>
        </p>
    </body>
</html>
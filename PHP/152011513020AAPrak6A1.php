<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 6
        </title>
        <link rel="stylesheet" href="template.css">
        <header class="header">
            Praktikum 6
        </header>
    </head>
    <body>
        <div class="card">
            <div class="card-content">
                <form action = "praktikum6.php" method = "POST">
                        <div class="card-nomor">
                            Nomor 1
                            <div class="underline"></div>
                        </div>
                        <div class="card-soal">
                            Menentukan Jumlah Digit Penyusun
                        </div>
                        <div class="perintah">
                            <input type = "number" name="a"/>
                            <label>Masukkan bilangan bulat positif</label>
                        </div>
                        <div class="perintah">
                            <input type = "number" name="b"/>
                            <label>Masukkan bilangan bulat positif</label>
                        </div>
                        <div class="perintah">
                            <input type = "number" name="c"/>
                            <label>Masukkan bilangan bulat positif</label>
                        </div>
                        <div class="perintah">
                            <input type = "number" name="d"/>
                            <label>Masukkan bilangan bulat positif</label>
                        </div>
                        <input class="submit-btn" type="submit" name="submit_1" value="Submit" />
                </form>
            </div>
        </div>
        <div class="card">
            <div class="card-content">
                <form action = "praktikum6.php" method = "POST">
                        <div class="card-nomor">
                            Nomor 2
                            <div class="underline"></div>
                        </div>
                        <div class="card-soal">
                            Bilangan Berdigit 6
                        </div>
                        <div class="perintah">
                            <input type = "number" name="o" required="required"/>
                            <label>Masukkan bilangan bulat positif</label>
                        </div>
                        <input class="submit-btn" type="submit" name="submit_2" value="Submit" />
                </form>
            </div>
        </div>
    </body>
</html>
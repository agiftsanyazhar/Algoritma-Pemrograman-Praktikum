<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 5
        </title>
        <link rel="stylesheet" href="template.css">
        <header class="header">
            Praktikum 5
        </header>
    </head>
    <body>
        <div class="card">
            <div class="card-content">
                <form action = "praktikum5.php" method = "POST">
                        <div class="card-nomor">
                            Nomor 1
                            <div class="underline"></div>
                        </div>
                        <div class="card-soal">
                            Menentukan Jumlah Digit Penyusun
                        </div>
                        <div class="perintah">
                            <input type = "number" name="n" required="required"/>
                            <label>Masukkan bilangan bulat positif</label>
                        </div>
                        <input class="submit-btn" type="submit" name="submit_1" value="Submit" />
                </form>
            </div>
        </div>
        <div class="card">
            <div class="card-content">
                <form action = "praktikum5.php" method = "POST">
                        <div class="card-nomor">
                            Nomor 2
                            <div class="underline"></div>
                        </div>
                        <div class="card-soal">
                            Menentukan Jumlah Digit yang Genap
                        </div>
                        <div class="perintah">
                            <input type = "number" name="o" required="required"/>
                            <label>Masukkan bilangan bulat positif</label>
                        </div>
                        <input class="submit-btn" type="submit" name="submit_2" value="Submit" />
                </form>
            </div>
        </div>
        <div class="card">
            <div class="card-content">
                <form action = "praktikum5.php" method = "POST">
                        <div class="card-nomor">
                            Nomor 3
                            <div class="underline"></div>
                        </div>
                        <div class="card-soal">
                            Menentukan Apakah Ada Digit yang Kembar
                        </div>
                        <div class="perintah">
                            <input type = "number" name="p" required="required"/>
                            <label>Masukkan bilangan bulat positif</label>
                        </div>
                        <input class="submit-btn" type="submit" name="submit_3" value="Submit" />
                </form>
            </div>
        </div>
    </body>
</html>
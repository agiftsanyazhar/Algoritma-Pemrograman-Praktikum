<!DOCTYPE html>
<html>
    <head>
        <meta charset="windows-1252">
        <title>
            Praktikum 11
        </title>
        <link rel="stylesheet" href="template2.css">
    </head>
    <body>
        <section>
            <!-- Nomor 1 -->
            <form action = "praktikum11.1.php" method = "POST">
                <div class="container">
                    <div class="soal">
                        <div>
                            <h2>Nomor 1</h2>
                            <div class="info">
                                Buatlah Flowchart dan Pseudocode dengan ketentuan :<br>
                                <ol type="a">
                                    <li>Inputkan banyaknya bilangan (misalkan n) > banyaknya elemen array 1 dimensi</li>
                                    <li>Lakukan input bilangan satu per satu sebanyak n (misalkan : X1, X2, X3, … ,Xn) > X[0], X[1], X[2], … , X[n-1]</li>
                                    <li>Tampilkan semua nilai X di layar</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <div class="inputForm">
                        <h2>Praktikum 11</h2>
                        <div class="formBox">
                            <div class="inputBox w50">
                                <input type = "number" name="n_1" required="required"/>
                                <span>Masukkan banyak array</span>
                            </div>
                            <div class="submit">
                                <input type="submit" id="submit" name="submit_1" value="Submit" />
                            </div>
                        </div>
                    </div>
                </div>
            </form>

            <!-- Nomor 2 -->
            <form action = "praktikum11.2.php" method = "POST">
                <div class="container">
                    <div class="soal">
                        <div>
                            <h2>Nomor 2</h2>
                            <div class="info">
                                Buatlah Flowchart dan Pseudocode dengan ketentuan :<br>
                                <ol type="a">
                                    <li>Lakukan input bilangan satu per satu sebanyak 5 (misal X1=5, X2=1, X3=10,X4=8 ,X5=7)</li>
                                    <li>Tampilkan semua nilai X di layar</li>
                                    <li>Tukarkan nilai di X1 dan X4 (nilai-nilai X akan menjadi X1=8, X2=1, X3=10,X4=5 ,X5=7)</li>
                                    <li>Tampilkan semua nilai X di layar</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <div class="inputForm">
                        <h2>Praktikum 11</h2>
                        <div class="formBox">
                            <div class="inputBox w50">
                                <input type = "number" name="n_2" min="5" max="5" required="required"/>
                                <span>Masukkan banyak array</span>
                            </div>
                            <div class="submit">
                                <input type="submit" name="submit_2" value="Submit" />
                            </div>
                        </div>
                    </div>
                </div>
            </form>

            <!-- Nomor 3 -->
            <form action = "praktikum11.3.php" method = "POST">
                <div class="container">
                    <div class="soal">
                        <div>
                            <h2>Nomor 3</h2>
                            <div class="info">
                                Buatlah Flowchart dan Pseudocode dengan ketentuan :<br>
                                <ol type="a">
                                    <li>Inputkan banyaknya bilangan (misalkan n)</li>
                                    <li>Lakukan input bilangan satu per satu sebanyak n (misalkan : X1, X2, X3, … ,Xn)</li>
                                    <li>Tampilkan semua nilai X di layar</li>
                                    <li>Inputkan banyaknya bilangan (misalkan m)</li>
                                    <li>Lakukan input bilangan satu per satu sebanyak m (misalkan : Y1, Y2, Y3, … ,Ym)</li>
                                    <li>Tampilkan semua nilai Y di layar</li>
                                    <li>Lakukan penggabungan semua nilai X dan Y menjadi satu dan namakan sebagai Z1,Z2,…, Zn, Zn+1, Zn+1, …, Zn+m</li>
                                    <li>Tampilkan nilai Z di layar</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <div class="inputForm">
                        <h2>Praktikum 11</h2>
                        <div class="formBox">
                            <div class="inputBox w50">
                                <input type = "number" name="x" required="required"/>
                                <span>Masukkan array X</span>
                            </div>
                            <div class="inputBox w50">
                                <input type = "number" name="y" required="required"/>
                                <span>Masukkan array Y</span>
                            </div>
                            <div class="submit">
                                <input type="submit" name="submit_3" value="Submit"/>
                            </div>
                        </div>
                    </div>
                </div>
            </form>

            <!-- Nomor 4 -->
            <form action = "praktikum11.4.php" method = "POST">
                <div class="container">
                    <div class="soal">
                        <div>
                            <h2>Nomor 4</h2>
                            <div class="info">
                                Buatlah Flowchart dan Pseudocode dengan ketentuan :<br>
                                <ol type="a">
                                    <li>Menerima input dari keyboard sebuah bilangan bulat positip n (minimal 3 digit)</li>
                                    <li>Misal n terdiri atas 5 digit (boleh lebih boleh juga kurang), masukkan semua digit tersebut ke dalam X1, X2, X3, X4 dan X5</li>
                                    <li>Tampilkan isi X1, X2, X3, X4 dan X5 di layar monitor</li>
                                    <li>Tentukan posisi nilai data yang terbesar dan tampilkan hasilnya di layar</li>
                                    <li>Tukarkan nilai X1 dengan nilai X yang terbesar</li>
                                    <li>Tampilkan nilai X di layar</li>
                                    <li>Lakukan pergeseran ke kiri atas semua data pada X, data paling kiri pindah ke posisi paling kanan</li>
                                    <li>Tampilkan nilai X di layar</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                    <div class="inputForm">
                        <h2>Praktikum 11</h2>
                        <div class="formBox">
                            <div class="inputBox w50">
                                <input type = "number" name="n_4" min="3" required="required"/>
                                <span>Masukkan banyak array</span>
                            </div>
                            <div class="submit">
                                <input type="submit" name="submit_4" value="Submit" />
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </section>
    </body>
</html>
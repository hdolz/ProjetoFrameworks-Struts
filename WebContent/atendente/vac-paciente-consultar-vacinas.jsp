<%-- 
    Document   : vac-paciente-consultar-vacinas
    Created on : 15/09/2018, 20:28:42
    Author     : gustav0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib prefix="s" uri="/struts-tags" %>--%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE-edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="icon" href="../img/logo-p.png">
        <title>E-Vacinas</title>

        <!--CSS PATH INICIO -->
        <link href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/style.css" rel="stylesheet">
        <link href="../css/upload-img-exibir.css" rel="stylesheet">
        <!--CSS PATH FIM -->

    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-white bg-primary">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>


            <a class="navbar-brand" href="/">
                <img src="../img/logo-topo.png"  alt="">
            </a>




            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <h4 class="text-light">
                        Console de Vacinação
                    </h4>
                </ul>
            </div>



            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">

                    <li class="nav-item">
                        <a href="#" title="Usuário">
                            <button class="btn btn-outline-light my-2 my-sm-0">
                                <i class="far fa-user-circle"></i>
                                <i> Nome Usuário </i>
                            </button>
                        </a>
                    </li>

                    <li>&nbsp</li>

                    <li class="nav-item">
                        <a href="#" title="Sair">
                            <button class="btn btn-outline-light my-2 my-sm-0">
                                <i class="fas fa-sign-out-alt"></i>
                            </button>
                        </a>
                    </li>

                </ul>
            </div>

        </nav>




        <!--MENU LATERAL INICIO -->
        <div class="container-fluid">
            <div class="row">
                <nav class="col-md-2 d-none d-md-block bg-light sidebar">
                    <div class="sidebar-sticky">

                        <ul class="nav flex-column">
                            <li class="nav-item">
                                <a class="nav-link active text-secondary" href="#">
                                    <i class="fas fa-home"></i>
                                    &nbspInício <span class="sr-only">(current)</span>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link text-secondary" href="#">
                                    <i class="fas fa-sign-out-alt"></i>
                                    Sair
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>
                <!--MENU LATERAL FIM -->






                <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
                    <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                        <h1 class="h2">Consulta de Vacinas</h1>
                        <div class="btn-toolbar mb-2 mb-md-0">
                            <div class="btn-group mr-2">
                                <a class="btn btn-sm btn-outline-secondary" href="#">Voltar</a>
                            </div>
                        </div>
                    </div>
                    <div>

                        <BR>
                        <h6> Nome: Sergio Lindo Bonito de Oliveira </h6>
                        <h6> Nº da Carteirinha do SUS: 00000692211 </h6>
                        <h6> Sexo: Eu Gosto </h6>
                        <h6> Data de Nascimento: 29/06/1987 </h6>
                        <BR>
                        <H3> Registro de Vacinação</H3>
                        <BR>
                        <div class="table-responsive">
                            <table class="table table-striped table-sm">
                                <thead>
                                    <tr>
                                        <th>Nome da Vacina</th>
                                        <th>Dose</th>
                                        <th>Data da Vacina</th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <tr>
                                        <td>BCG</td>
                                        <td>Dose Única</td>
                                        <td>25/05/2017</td>
                                    </tr>



                                    <tr>
                                        <td>Hepatite B</td>
                                        <td>1º Dose</td>
                                        <td>16/03/2018</td>
                                    </tr>

                                    <tr>
                                        <td>Viadagem</td>
                                        <td>Dose Única</td>
                                        <td>25/05/2017</td>
                                    </tr>

                                    <tr>
                                        <td>Babaquice</td>
                                        <td>Dose Única</td>
                                        <td>25/05/2017</td>
                                    </tr>

                                </tbody>
                            </table>
                        </div>
                    </div>



                </main>








            </div>
        </div>


        <!--JAVASCRIPT PATH INICIO -->
        <script src="../js/jquery.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/upload-img-exibir.js"></script>
        <script defer src="../js/fontawesome-all.js"></script>
        <!--JAVASCRIPT PATH FIM -->


    </body>
</html>

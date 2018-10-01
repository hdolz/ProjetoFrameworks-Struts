<%-- 
    Document   : vac-principal
    Created on : 15/09/2018, 20:32:15
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
                        <h1 class="h2">Local de Vacina</h1>

                    </div>
                    <div>

                        <nav class="navbar">
                            <div class="btn-group">
                                <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Selecionar Local</button>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="#">Local 1 - Cidade - Estado</a>
                                    <a class="dropdown-item" href="#">Local 2 - Cidade - Estado</a>
                                    <a class="dropdown-item" href="#">Local 3 - Cidade - Estado</a>
                                </div>
                                <span>&nbsp</span><span>&nbsp</span><span>&nbsp</span>
                                <input class="form-control mr-sm-2" type="search" size="100" placeholder="Local (READ ONLY)" aria-label="Search"  maxlength="120">
                                <span>&nbsp</span>
                                <a class="btn btn-sm btn-outline-primary" href="#">Confirmar Local</a>
                            </div>
                        </nav>





                        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                            <h1 class="h2">Pacientes</h1>
                            <div class="btn-toolbar mb-2 mb-md-0">
                                <div class="btn-group mr-2">



                                    <input class="form-control mr-sm-2" type="search" size="50" placeholder="Pesquisar Nome de Pacientes" aria-label="Search" autofocus maxlength="120">
                                    <button class="btn my-2 btn-outline-secondary my-sm-0" type="submit"><i class="fas fa-search"></i></button>
                                    <span>&nbsp</span>

                                    <a class="btn btn-sm btn-outline-secondary" href="adm-postagens-cadastrar.html">Novo Paciente</a>

                                </div>
                            </div>
                        </div>
                        <div>

                            <div class="table-responsive">
                                <table class="table table-striped table-sm">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Nome do Paciente</th>
                                            <th>Nº do SUS</th>
                                            <th>Sexo</th>
                                            <th>Data de Nascimento</th>
                                            <th>Funções</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <tr>
                                            <td>1</td>
                                            <td>Sergio Roberto Pinto de Oliveira</td>
                                            <td>000111888555</td>
                                            <td>M</td>
                                            <td>29/06/1987</td>
                                            <td>
                                                <button type="button" class="btn btn-outline-info btn-sm"><i class="fas fa-syringe"></i></button>
                                                <button type="button" class="btn btn-outline-success btn-sm"><i class="fas fa-eye"></i></button>
                                            </td>
                                        </tr>



                                        <tr>
                                            <td>2</td>
                                            <td>Jair Messias Bolsonaro</td>
                                            <td>000171717171</td>
                                            <td>M</td>
                                            <td>15/10/1955</td>
                                            <td>
                                                <button type="button" class="btn btn-outline-info btn-sm"><i class="fas fa-syringe"></i></button>
                                                <button type="button" class="btn btn-outline-success btn-sm"><i class="fas fa-eye"></i></button>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td>3</td>
                                            <td>Dilma Rouseff Souza Prikito</td>
                                            <td>000131313131</td>
                                            <td>F</td>
                                            <td>31/02/1900</td>
                                            <td>
                                                <button type="button" class="btn btn-outline-info btn-sm"><i class="fas fa-syringe"></i></button>
                                                <button type="button" class="btn btn-outline-success btn-sm"><i class="fas fa-eye"></i></button>
                                            </td>
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

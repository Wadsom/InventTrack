import NavBar from "../NavBar";
import TableList from "../TableListProds";
import Footer from "../Footer";
import BarChart from "../BarChart";
import DonutChart from "../DonutChart";



export default function BodyClient() {
  return (
    <>
      <NavBar />
      <div className="container">
        <div className="col-lg-5">
          <h1 className="text-primary py-3"> Dashboard de Monitoramento</h1>
        </div>
        <div className="row px-3 ">
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">
              % de Sucesso de Monitoramento
            </h5>
            <BarChart />
          </div>

          <div className="col-sm-6">
            <h5 className="text-center text-secundary">
              % de Sucesso de Monitoramento
            </h5>
            <DonutChart />
          </div>
        </div>

        <h1 className="text-primary">Lista de Produtos</h1>
        <TableList />
      </div>
      <div className="Footer">
        <Footer />
      </div>
    </>
  );
}

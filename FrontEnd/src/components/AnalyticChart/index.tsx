
import Chart from "react-apexcharts";


export default function AnalyticChart(){


   const options = {
    plotOptions: {
        bar: {
            horizontal: true,
        }
    },
        chart: {
          height: 280,
          type: "area"
        },
        dataLabels: {
          enabled: false
        }
    }
        const MokData = { labels: {
            categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
        }
        ,
        series: [
          {
            name: "% de Sucesso/Mês",
            data: [45, 52, 38, 45, 19, 23, 2]
          }
        ],
        fill: {
          type: "gradient",
          gradient: {
            shadeIntensity: 1,
            opacityFrom: 0.7,
            opacityTo: 0.9,
            stops: [0, 90, 100]
          }
        },
        xaxis: {
          categories: [
            "01 Jan",
            "02 Fev",
            "03 Mar",
            "04 Abr",
            "05 Mai",
            "06 Jun",
            "07 Jul"
          ]
        }
      };


      return(
        <Chart 
        options={{...Op, xaxis:options.xaxis}}
        />
      )
}
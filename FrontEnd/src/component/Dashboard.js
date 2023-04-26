import axios from 'axios';
import React from 'react';
import Pdf from "react-to-pdf";
import QRCode from 'react-qr-code';
import { Link } from 'react-router-dom'

function Data(){
  const baseURL = "http://localhost:8080/asset/all"
  const [asset, setAsset] = React.useState(null);

  React.useEffect(() => {
    console.log("inside useEffect");
    axios.get(baseURL).then((response) => {
      console.log("inside axios")
      console.log(response.data);
      setAsset(response.data);
    });
  }, []);

  if (!asset) return null;
  console.log("showing post")
  console.log(asset);
  return (
    <>
    {asset.map(asset => (
      <tr key={asset.assetId}>
                <td><Link to="/update">{asset.assetId}</Link></td>
                <td>{asset.assetName}</td>
                <td>{asset.qty}</td>
                <td>{asset.status}</td>
                <td>{asset.createTime}</td>
                <td>{asset.lastUpdateTime}</td>
                <td>
                  <div style={{ height: "auto", margin: "0 auto", maxWidth: 64, width: "100%" }}>
                    <QRCode
                    size={256}
                    style={{ height: "auto", maxWidth: "100%", width: "100%" }}
                    value={JSON.stringify(asset)}
                    viewBox={`0 0 256 256`}
                    />
                  </div>
                </td>
              </tr>
            ))} 
    </>
            );
}
export default function Dashboard() {
  return (
    <div className="container">
      <div className="row border border-dark">
      </div>
        <div className="row">
          <div className="col">
            <button type="button" className="btn btn-primary ">Add Category</button>
          </div>
          <div className="col">
            <button type="button" className="btn btn-primary ">Make Report</button>
          </div>
          <div className="col">
            <Link to="/Login">
              <button type="button" className="btn btn-primary btn-danger">Log Out</button>
            </Link>
          </div>
        </div>
        <div className="row mt-5" >
        <table class="table table-bordered">
                    <thead>
                      <tr className="form-control">
                        <th>AssetId</th>
                        <th>Asset Name</th>
                        <th>Quantity</th>
                        <th>Status</th>
                        <th>Created</th>
                        <th>Last Update</th>
                        <th>QR Code</th>
                      </tr>
                    </thead>
                    <tbody className='form-control'>
                        <Data />
                    </tbody>
                  </table>
        </div>
    </div>
  )
}
